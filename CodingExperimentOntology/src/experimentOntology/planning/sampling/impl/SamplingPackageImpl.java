/**
 */
package experimentOntology.planning.sampling.impl;

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

import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;

import experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl;

import experimentOntology.planning.impl.PlanningPackageImpl;

import experimentOntology.planning.sampling.ConvenienceSampling;
import experimentOntology.planning.sampling.NoProbabilityTechinique;
import experimentOntology.planning.sampling.PopulationDescription;
import experimentOntology.planning.sampling.ProbabilityTechinique;
import experimentOntology.planning.sampling.QuoteSampling;
import experimentOntology.planning.sampling.SamplingFactory;
import experimentOntology.planning.sampling.SamplingPackage;
import experimentOntology.planning.sampling.SamplingStrategy;
import experimentOntology.planning.sampling.SimpleRandomTechinique;
import experimentOntology.planning.sampling.StratifiedRandomSamplingTechinique;
import experimentOntology.planning.sampling.SystematicTechinique;

import experimentOntology.planning.threats.ThreatsPackage;

import experimentOntology.planning.threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamplingPackageImpl extends EPackageImpl implements SamplingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityTechiniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRandomTechiniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systematicTechiniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stratifiedRandomSamplingTechiniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noProbabilityTechiniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convenienceSamplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quoteSamplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationDescriptionEClass = null;

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
	 * @see experimentOntology.planning.sampling.SamplingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SamplingPackageImpl() {
		super(eNS_URI, SamplingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SamplingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SamplingPackage init() {
		if (isInited) return (SamplingPackage)EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI);

		// Obtain or create and register package
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SamplingPackageImpl());

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
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) : DesignOfExperimentPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		theSamplingPackage.createPackageContents();
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
		theDesignOfExperimentPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		theSamplingPackage.initializePackageContents();
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
		theDesignOfExperimentPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSamplingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SamplingPackage.eNS_URI, theSamplingPackage);
		return theSamplingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSamplingStrategy() {
		return samplingStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilityTechinique() {
		return probabilityTechiniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilityTechinique_Population() {
		return (EReference)probabilityTechiniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRandomTechinique() {
		return simpleRandomTechiniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystematicTechinique() {
		return systematicTechiniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStratifiedRandomSamplingTechinique() {
		return stratifiedRandomSamplingTechiniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoProbabilityTechinique() {
		return noProbabilityTechiniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvenienceSampling() {
		return convenienceSamplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuoteSampling() {
		return quoteSamplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationDescription() {
		return populationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingFactory getSamplingFactory() {
		return (SamplingFactory)getEFactoryInstance();
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
		samplingStrategyEClass = createEClass(SAMPLING_STRATEGY);

		probabilityTechiniqueEClass = createEClass(PROBABILITY_TECHINIQUE);
		createEReference(probabilityTechiniqueEClass, PROBABILITY_TECHINIQUE__POPULATION);

		simpleRandomTechiniqueEClass = createEClass(SIMPLE_RANDOM_TECHINIQUE);

		systematicTechiniqueEClass = createEClass(SYSTEMATIC_TECHINIQUE);

		stratifiedRandomSamplingTechiniqueEClass = createEClass(STRATIFIED_RANDOM_SAMPLING_TECHINIQUE);

		noProbabilityTechiniqueEClass = createEClass(NO_PROBABILITY_TECHINIQUE);

		convenienceSamplingEClass = createEClass(CONVENIENCE_SAMPLING);

		quoteSamplingEClass = createEClass(QUOTE_SAMPLING);

		populationDescriptionEClass = createEClass(POPULATION_DESCRIPTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		probabilityTechiniqueEClass.getESuperTypes().add(this.getSamplingStrategy());
		simpleRandomTechiniqueEClass.getESuperTypes().add(this.getProbabilityTechinique());
		systematicTechiniqueEClass.getESuperTypes().add(this.getProbabilityTechinique());
		stratifiedRandomSamplingTechiniqueEClass.getESuperTypes().add(this.getProbabilityTechinique());
		noProbabilityTechiniqueEClass.getESuperTypes().add(this.getSamplingStrategy());
		convenienceSamplingEClass.getESuperTypes().add(this.getNoProbabilityTechinique());
		quoteSamplingEClass.getESuperTypes().add(this.getNoProbabilityTechinique());

		// Initialize classes, features, and operations; add parameters
		initEClass(samplingStrategyEClass, SamplingStrategy.class, "SamplingStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilityTechiniqueEClass, ProbabilityTechinique.class, "ProbabilityTechinique", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilityTechinique_Population(), this.getPopulationDescription(), null, "population", null, 1, 1, ProbabilityTechinique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRandomTechiniqueEClass, SimpleRandomTechinique.class, "SimpleRandomTechinique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systematicTechiniqueEClass, SystematicTechinique.class, "SystematicTechinique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stratifiedRandomSamplingTechiniqueEClass, StratifiedRandomSamplingTechinique.class, "StratifiedRandomSamplingTechinique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noProbabilityTechiniqueEClass, NoProbabilityTechinique.class, "NoProbabilityTechinique", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convenienceSamplingEClass, ConvenienceSampling.class, "ConvenienceSampling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quoteSamplingEClass, QuoteSampling.class, "QuoteSampling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(populationDescriptionEClass, PopulationDescription.class, "PopulationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SamplingPackageImpl
