/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import codingExperimentOntology.CodingExperimentOntologyPackage;

import codingExperimentOntology.apparatus.NewPackage4Package;

import codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl;

import codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl;

import codingExperimentOntology.tasks.NewPackage2Package;

import codingExperimentOntology.tasks.impl.NewPackage2PackageImpl;

import codingExperimentOntology.threats.NewPackage3Package;

import codingExperimentOntology.threats.impl.NewPackage3PackageImpl;

import codingExperimentOntology.variables.NewPackage1Package;

import codingExperimentOntology.variables.impl.NewPackage1PackageImpl;

import experimentOntology.ExperimentOntologyPackage;

import experimentOntology.description.DescriptionPackage;

import experimentOntology.description.gqm.GqmPackage;

import experimentOntology.description.gqm.impl.GqmPackageImpl;

import experimentOntology.description.impl.DescriptionPackageImpl;

import experimentOntology.impl.ExperimentOntologyPackageImpl;

import experimentOntology.operation.OperationPackage;

import experimentOntology.operation.impl.OperationPackageImpl;

import experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage;

import experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl;

import experimentOntology.planning.PlanningPackage;

import experimentOntology.planning.designOfExperiment.BalancedDesignDiscipline;
import experimentOntology.planning.designOfExperiment.BlockDesignDiscipline;
import experimentOntology.planning.designOfExperiment.BlockedCharacteristic;
import experimentOntology.planning.designOfExperiment.DesignDiscipline;
import experimentOntology.planning.designOfExperiment.DesignOfExperimentFactory;
import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;
import experimentOntology.planning.designOfExperiment.DesignType;
import experimentOntology.planning.designOfExperiment.GenericDesign;
import experimentOntology.planning.designOfExperiment.MultTreatmentDesign;
import experimentOntology.planning.designOfExperiment.NestedFactorDesign;
import experimentOntology.planning.designOfExperiment.OneFactorDesign;
import experimentOntology.planning.designOfExperiment.RandomizedDiscipline;
import experimentOntology.planning.designOfExperiment.SquareDesign;
import experimentOntology.planning.designOfExperiment.TriFactorDesign;
import experimentOntology.planning.designOfExperiment.TriFactorTypes;
import experimentOntology.planning.designOfExperiment.TwoFactorDesign;
import experimentOntology.planning.designOfExperiment.TwoTreatmentDesign;

import experimentOntology.planning.impl.PlanningPackageImpl;

import experimentOntology.planning.sampling.SamplingPackage;

import experimentOntology.planning.sampling.impl.SamplingPackageImpl;

import experimentOntology.planning.threats.ThreatsPackage;

import experimentOntology.planning.threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignOfExperimentPackageImpl extends EPackageImpl implements DesignOfExperimentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designDisciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomizedDisciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockDesignDisciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balancedDesignDisciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockedCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneFactorDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoTreatmentDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multTreatmentDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoFactorDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedFactorDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triFactorDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triFactorTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DesignOfExperimentPackageImpl() {
		super(eNS_URI, DesignOfExperimentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DesignOfExperimentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DesignOfExperimentPackage init() {
		if (isInited) return (DesignOfExperimentPackage)EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI);

		// Obtain or create and register package
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DesignOfExperimentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingExperimentOntologyPackageImpl theCodingExperimentOntologyPackage = (CodingExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) instanceof CodingExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) : CodingExperimentOntologyPackage.eINSTANCE);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) instanceof NewPackage1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) : NewPackage1Package.eINSTANCE);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) instanceof NewPackage2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) : NewPackage2Package.eINSTANCE);
		NewPackage3PackageImpl theNewPackage3Package = (NewPackage3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) instanceof NewPackage3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) : NewPackage3Package.eINSTANCE);
		NewPackage4PackageImpl theNewPackage4Package = (NewPackage4PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) instanceof NewPackage4PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) : NewPackage4Package.eINSTANCE);
		ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) : ExperimentOntologyPackage.eINSTANCE);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) : DescriptionPackage.eINSTANCE);
		GqmPackageImpl theGqmPackage = (GqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) instanceof GqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) : GqmPackage.eINSTANCE);
		PlanningPackageImpl thePlanningPackage = (PlanningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) instanceof PlanningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) : PlanningPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) : SamplingPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		theDesignOfExperimentPackage.createPackageContents();
		theCodingExperimentOntologyPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theNewPackage3Package.createPackageContents();
		theNewPackage4Package.createPackageContents();
		theExperimentOntologyPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();
		theGqmPackage.createPackageContents();
		thePlanningPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theSamplingPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		theDesignOfExperimentPackage.initializePackageContents();
		theCodingExperimentOntologyPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theNewPackage3Package.initializePackageContents();
		theNewPackage4Package.initializePackageContents();
		theExperimentOntologyPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();
		theGqmPackage.initializePackageContents();
		thePlanningPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theSamplingPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDesignOfExperimentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DesignOfExperimentPackage.eNS_URI, theDesignOfExperimentPackage);
		return theDesignOfExperimentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignType() {
		return designTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignType_Discipline() {
		return (EReference)designTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignDiscipline() {
		return designDisciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomizedDiscipline() {
		return randomizedDisciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockDesignDiscipline() {
		return blockDesignDisciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockDesignDiscipline_Block() {
		return (EReference)blockDesignDisciplineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalancedDesignDiscipline() {
		return balancedDesignDisciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockedCharacteristic() {
		return blockedCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockedCharacteristic_Threat() {
		return (EReference)blockedCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneFactorDesign() {
		return oneFactorDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoTreatmentDesign() {
		return twoTreatmentDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultTreatmentDesign() {
		return multTreatmentDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoFactorDesign() {
		return twoFactorDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquareDesign() {
		return squareDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquareDesign_Column() {
		return (EReference)squareDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquareDesign_Line() {
		return (EReference)squareDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedFactorDesign() {
		return nestedFactorDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedFactorDesign_StageOne() {
		return (EReference)nestedFactorDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedFactorDesign_StageTwo() {
		return (EReference)nestedFactorDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriFactorDesign() {
		return triFactorDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriFactorDesign_Type() {
		return (EAttribute)triFactorDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDesign() {
		return genericDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriFactorTypes() {
		return triFactorTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignOfExperimentFactory getDesignOfExperimentFactory() {
		return (DesignOfExperimentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		designTypeEClass = createEClass(DESIGN_TYPE);
		createEReference(designTypeEClass, DESIGN_TYPE__DISCIPLINE);

		designDisciplineEClass = createEClass(DESIGN_DISCIPLINE);

		randomizedDisciplineEClass = createEClass(RANDOMIZED_DISCIPLINE);

		blockDesignDisciplineEClass = createEClass(BLOCK_DESIGN_DISCIPLINE);
		createEReference(blockDesignDisciplineEClass, BLOCK_DESIGN_DISCIPLINE__BLOCK);

		balancedDesignDisciplineEClass = createEClass(BALANCED_DESIGN_DISCIPLINE);

		blockedCharacteristicEClass = createEClass(BLOCKED_CHARACTERISTIC);
		createEReference(blockedCharacteristicEClass, BLOCKED_CHARACTERISTIC__THREAT);

		oneFactorDesignEClass = createEClass(ONE_FACTOR_DESIGN);

		twoTreatmentDesignEClass = createEClass(TWO_TREATMENT_DESIGN);

		multTreatmentDesignEClass = createEClass(MULT_TREATMENT_DESIGN);

		twoFactorDesignEClass = createEClass(TWO_FACTOR_DESIGN);

		squareDesignEClass = createEClass(SQUARE_DESIGN);
		createEReference(squareDesignEClass, SQUARE_DESIGN__COLUMN);
		createEReference(squareDesignEClass, SQUARE_DESIGN__LINE);

		nestedFactorDesignEClass = createEClass(NESTED_FACTOR_DESIGN);
		createEReference(nestedFactorDesignEClass, NESTED_FACTOR_DESIGN__STAGE_ONE);
		createEReference(nestedFactorDesignEClass, NESTED_FACTOR_DESIGN__STAGE_TWO);

		triFactorDesignEClass = createEClass(TRI_FACTOR_DESIGN);
		createEAttribute(triFactorDesignEClass, TRI_FACTOR_DESIGN__TYPE);

		genericDesignEClass = createEClass(GENERIC_DESIGN);

		// Create enums
		triFactorTypesEEnum = createEEnum(TRI_FACTOR_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ThreatsPackage theThreatsPackage = (ThreatsPackage)EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI);
		PlanningPackage thePlanningPackage = (PlanningPackage)EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		randomizedDisciplineEClass.getESuperTypes().add(this.getDesignDiscipline());
		blockDesignDisciplineEClass.getESuperTypes().add(this.getDesignDiscipline());
		balancedDesignDisciplineEClass.getESuperTypes().add(this.getBlockDesignDiscipline());
		oneFactorDesignEClass.getESuperTypes().add(this.getDesignType());
		twoTreatmentDesignEClass.getESuperTypes().add(this.getOneFactorDesign());
		multTreatmentDesignEClass.getESuperTypes().add(this.getOneFactorDesign());
		twoFactorDesignEClass.getESuperTypes().add(this.getDesignType());
		squareDesignEClass.getESuperTypes().add(this.getTwoFactorDesign());
		nestedFactorDesignEClass.getESuperTypes().add(this.getTwoFactorDesign());
		triFactorDesignEClass.getESuperTypes().add(this.getDesignType());
		genericDesignEClass.getESuperTypes().add(this.getDesignType());

		// Initialize classes, features, and operations; add parameters
		initEClass(designTypeEClass, DesignType.class, "DesignType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignType_Discipline(), this.getDesignDiscipline(), null, "discipline", null, 1, 1, DesignType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designDisciplineEClass, DesignDiscipline.class, "DesignDiscipline", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomizedDisciplineEClass, RandomizedDiscipline.class, "RandomizedDiscipline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockDesignDisciplineEClass, BlockDesignDiscipline.class, "BlockDesignDiscipline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockDesignDiscipline_Block(), this.getBlockedCharacteristic(), null, "block", null, 1, -1, BlockDesignDiscipline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(balancedDesignDisciplineEClass, BalancedDesignDiscipline.class, "BalancedDesignDiscipline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockedCharacteristicEClass, BlockedCharacteristic.class, "BlockedCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockedCharacteristic_Threat(), theThreatsPackage.getThreat(), null, "threat", null, 0, 1, BlockedCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneFactorDesignEClass, OneFactorDesign.class, "OneFactorDesign", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoTreatmentDesignEClass, TwoTreatmentDesign.class, "TwoTreatmentDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multTreatmentDesignEClass, MultTreatmentDesign.class, "MultTreatmentDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoFactorDesignEClass, TwoFactorDesign.class, "TwoFactorDesign", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(squareDesignEClass, SquareDesign.class, "SquareDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSquareDesign_Column(), thePlanningPackage.getFactor(), null, "column", null, 1, 1, SquareDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSquareDesign_Line(), thePlanningPackage.getFactor(), null, "line", null, 1, 1, SquareDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedFactorDesignEClass, NestedFactorDesign.class, "NestedFactorDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedFactorDesign_StageOne(), thePlanningPackage.getFactor(), null, "stageOne", null, 1, 1, NestedFactorDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNestedFactorDesign_StageTwo(), thePlanningPackage.getFactor(), null, "stageTwo", null, 1, 1, NestedFactorDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triFactorDesignEClass, TriFactorDesign.class, "TriFactorDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriFactorDesign_Type(), this.getTriFactorTypes(), "type", "TwoK", 0, 1, TriFactorDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericDesignEClass, GenericDesign.class, "GenericDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(triFactorTypesEEnum, TriFactorTypes.class, "TriFactorTypes");
		addEEnumLiteral(triFactorTypesEEnum, TriFactorTypes.TWO_K);
		addEEnumLiteral(triFactorTypesEEnum, TriFactorTypes.HALF_TWO_K);
		addEEnumLiteral(triFactorTypesEEnum, TriFactorTypes.QUARTER_TWO_K);
	}

} //DesignOfExperimentPackageImpl
