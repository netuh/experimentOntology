/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.CodingExperimentOntologyPackage;

import codingExperimentOntology.apparatus.Choice;
import codingExperimentOntology.apparatus.ChoiceTypes;
import codingExperimentOntology.apparatus.CodignApparatus;
import codingExperimentOntology.apparatus.CodingArtifact;
import codingExperimentOntology.apparatus.CodingArtifactTypes;
import codingExperimentOntology.apparatus.CodingInstrument;
import codingExperimentOntology.apparatus.Field;
import codingExperimentOntology.apparatus.FieldTypes;
import codingExperimentOntology.apparatus.NewPackage4Factory;
import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.ProcessRelated;
import codingExperimentOntology.apparatus.Question;
import codingExperimentOntology.apparatus.QuestionContent;
import codingExperimentOntology.apparatus.QuestionaryByTask;
import codingExperimentOntology.apparatus.Questionnaire;
import codingExperimentOntology.apparatus.QuestionnaireByProcess;
import codingExperimentOntology.apparatus.QuestionnarieAllocation;
import codingExperimentOntology.apparatus.ResourceMonitorInstrument;
import codingExperimentOntology.apparatus.TaskRelated;
import codingExperimentOntology.apparatus.TimeMonitorByProcess;
import codingExperimentOntology.apparatus.TimeMonitorByResource;
import codingExperimentOntology.apparatus.TimeMonitorByTask;
import codingExperimentOntology.apparatus.TimeMonitorInstrument;

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
public class NewPackage4PackageImpl extends EPackageImpl implements NewPackage4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codignApparatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingInstrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMonitorInstrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeMonitorInstrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeMonitorByResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeMonitorByTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeMonitorByProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionaryByTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireByProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codingArtifactTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnarieAllocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum choiceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldTypesEEnum = null;

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
	 * @see codingExperimentOntology.apparatus.NewPackage4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NewPackage4PackageImpl() {
		super(eNS_URI, NewPackage4Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NewPackage4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NewPackage4Package init() {
		if (isInited) return (NewPackage4Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI);

		// Obtain or create and register package
		NewPackage4PackageImpl theNewPackage4Package = (NewPackage4PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NewPackage4PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NewPackage4PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingExperimentOntologyPackageImpl theCodingExperimentOntologyPackage = (CodingExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) instanceof CodingExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) : CodingExperimentOntologyPackage.eINSTANCE);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) instanceof NewPackage1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) : NewPackage1Package.eINSTANCE);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) instanceof NewPackage2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) : NewPackage2Package.eINSTANCE);
		NewPackage3PackageImpl theNewPackage3Package = (NewPackage3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) instanceof NewPackage3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) : NewPackage3Package.eINSTANCE);
		ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) : ExperimentOntologyPackage.eINSTANCE);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) : DescriptionPackage.eINSTANCE);
		GqmPackageImpl theGqmPackage = (GqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) instanceof GqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) : GqmPackage.eINSTANCE);
		PlanningPackageImpl thePlanningPackage = (PlanningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) instanceof PlanningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) : PlanningPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) : SamplingPackage.eINSTANCE);
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) : DesignOfExperimentPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		theNewPackage4Package.createPackageContents();
		theCodingExperimentOntologyPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theNewPackage3Package.createPackageContents();
		theExperimentOntologyPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();
		theGqmPackage.createPackageContents();
		thePlanningPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theSamplingPackage.createPackageContents();
		theDesignOfExperimentPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		theNewPackage4Package.initializePackageContents();
		theCodingExperimentOntologyPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theNewPackage3Package.initializePackageContents();
		theExperimentOntologyPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();
		theGqmPackage.initializePackageContents();
		thePlanningPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theSamplingPackage.initializePackageContents();
		theDesignOfExperimentPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNewPackage4Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NewPackage4Package.eNS_URI, theNewPackage4Package);
		return theNewPackage4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodignApparatus() {
		return codignApparatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodingArtifact() {
		return codingArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodingArtifact_Type() {
		return (EAttribute)codingArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodingInstrument() {
		return codingInstrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceMonitorInstrument() {
		return resourceMonitorInstrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceMonitorInstrument_Target() {
		return (EReference)resourceMonitorInstrumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceMonitorInstrument_Creation() {
		return (EAttribute)resourceMonitorInstrumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceMonitorInstrument_Modification() {
		return (EAttribute)resourceMonitorInstrumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceMonitorInstrument_Delete() {
		return (EAttribute)resourceMonitorInstrumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeMonitorInstrument() {
		return timeMonitorInstrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Questions() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaire_Allocation() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeMonitorByResource() {
		return timeMonitorByResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeMonitorByResource_Artifact() {
		return (EReference)timeMonitorByResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeMonitorByTask() {
		return timeMonitorByTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeMonitorByProcess() {
		return timeMonitorByProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRelated() {
		return taskRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRelated_Task() {
		return (EReference)taskRelatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRelated() {
		return processRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionaryByTask() {
		return questionaryByTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireByProcess() {
		return questionnaireByProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Enunciation() {
		return (EReference)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionContent() {
		return questionContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Type() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoice_Choices() {
		return (EReference)choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_Type() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodingArtifactTypes() {
		return codingArtifactTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnarieAllocation() {
		return questionnarieAllocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChoiceTypes() {
		return choiceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFieldTypes() {
		return fieldTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage4Factory getNewPackage4Factory() {
		return (NewPackage4Factory)getEFactoryInstance();
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
		codignApparatusEClass = createEClass(CODIGN_APPARATUS);

		codingArtifactEClass = createEClass(CODING_ARTIFACT);
		createEAttribute(codingArtifactEClass, CODING_ARTIFACT__TYPE);

		codingInstrumentEClass = createEClass(CODING_INSTRUMENT);

		resourceMonitorInstrumentEClass = createEClass(RESOURCE_MONITOR_INSTRUMENT);
		createEReference(resourceMonitorInstrumentEClass, RESOURCE_MONITOR_INSTRUMENT__TARGET);
		createEAttribute(resourceMonitorInstrumentEClass, RESOURCE_MONITOR_INSTRUMENT__CREATION);
		createEAttribute(resourceMonitorInstrumentEClass, RESOURCE_MONITOR_INSTRUMENT__MODIFICATION);
		createEAttribute(resourceMonitorInstrumentEClass, RESOURCE_MONITOR_INSTRUMENT__DELETE);

		timeMonitorInstrumentEClass = createEClass(TIME_MONITOR_INSTRUMENT);

		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__QUESTIONS);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__ALLOCATION);

		timeMonitorByResourceEClass = createEClass(TIME_MONITOR_BY_RESOURCE);
		createEReference(timeMonitorByResourceEClass, TIME_MONITOR_BY_RESOURCE__ARTIFACT);

		timeMonitorByTaskEClass = createEClass(TIME_MONITOR_BY_TASK);

		timeMonitorByProcessEClass = createEClass(TIME_MONITOR_BY_PROCESS);

		taskRelatedEClass = createEClass(TASK_RELATED);
		createEReference(taskRelatedEClass, TASK_RELATED__TASK);

		processRelatedEClass = createEClass(PROCESS_RELATED);

		questionaryByTaskEClass = createEClass(QUESTIONARY_BY_TASK);

		questionnaireByProcessEClass = createEClass(QUESTIONNAIRE_BY_PROCESS);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__ENUNCIATION);

		questionContentEClass = createEClass(QUESTION_CONTENT);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__TYPE);

		choiceEClass = createEClass(CHOICE);
		createEReference(choiceEClass, CHOICE__CHOICES);
		createEAttribute(choiceEClass, CHOICE__TYPE);

		// Create enums
		codingArtifactTypesEEnum = createEEnum(CODING_ARTIFACT_TYPES);
		questionnarieAllocationEEnum = createEEnum(QUESTIONNARIE_ALLOCATION);
		choiceTypesEEnum = createEEnum(CHOICE_TYPES);
		fieldTypesEEnum = createEEnum(FIELD_TYPES);
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
		PlanningPackage thePlanningPackage = (PlanningPackage)EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI);
		NewPackage2Package theNewPackage2Package = (NewPackage2Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codignApparatusEClass.getESuperTypes().add(thePlanningPackage.getApparatus());
		codingArtifactEClass.getESuperTypes().add(this.getCodignApparatus());
		codingArtifactEClass.getESuperTypes().add(thePlanningPackage.getArtifact());
		codingInstrumentEClass.getESuperTypes().add(this.getCodignApparatus());
		codingInstrumentEClass.getESuperTypes().add(thePlanningPackage.getArtifact());
		resourceMonitorInstrumentEClass.getESuperTypes().add(this.getCodingInstrument());
		timeMonitorInstrumentEClass.getESuperTypes().add(this.getCodingInstrument());
		questionnaireEClass.getESuperTypes().add(this.getCodingInstrument());
		timeMonitorByResourceEClass.getESuperTypes().add(this.getTimeMonitorInstrument());
		timeMonitorByTaskEClass.getESuperTypes().add(this.getTimeMonitorInstrument());
		timeMonitorByTaskEClass.getESuperTypes().add(this.getTaskRelated());
		timeMonitorByProcessEClass.getESuperTypes().add(this.getTimeMonitorInstrument());
		timeMonitorByProcessEClass.getESuperTypes().add(this.getProcessRelated());
		questionaryByTaskEClass.getESuperTypes().add(this.getTaskRelated());
		questionaryByTaskEClass.getESuperTypes().add(this.getQuestionnaire());
		questionnaireByProcessEClass.getESuperTypes().add(this.getProcessRelated());
		questionnaireByProcessEClass.getESuperTypes().add(this.getQuestionnaire());
		fieldEClass.getESuperTypes().add(this.getQuestion());
		choiceEClass.getESuperTypes().add(this.getQuestion());

		// Initialize classes, features, and operations; add parameters
		initEClass(codignApparatusEClass, CodignApparatus.class, "CodignApparatus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codingArtifactEClass, CodingArtifact.class, "CodingArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodingArtifact_Type(), this.getCodingArtifactTypes(), "type", "sourceCode", 0, 1, CodingArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codingInstrumentEClass, CodingInstrument.class, "CodingInstrument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceMonitorInstrumentEClass, ResourceMonitorInstrument.class, "ResourceMonitorInstrument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceMonitorInstrument_Target(), this.getCodingArtifact(), null, "target", null, 1, -1, ResourceMonitorInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceMonitorInstrument_Creation(), ecorePackage.getEBoolean(), "creation", null, 0, 1, ResourceMonitorInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceMonitorInstrument_Modification(), ecorePackage.getEBoolean(), "modification", null, 0, 1, ResourceMonitorInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceMonitorInstrument_Delete(), ecorePackage.getEBoolean(), "delete", null, 0, 1, ResourceMonitorInstrument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeMonitorInstrumentEClass, TimeMonitorInstrument.class, "TimeMonitorInstrument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaire_Questions(), this.getQuestion(), null, "questions", null, 1, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_Allocation(), this.getQuestionnarieAllocation(), "allocation", "before", 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeMonitorByResourceEClass, TimeMonitorByResource.class, "TimeMonitorByResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeMonitorByResource_Artifact(), this.getCodingArtifact(), null, "artifact", null, 1, -1, TimeMonitorByResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeMonitorByTaskEClass, TimeMonitorByTask.class, "TimeMonitorByTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeMonitorByProcessEClass, TimeMonitorByProcess.class, "TimeMonitorByProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskRelatedEClass, TaskRelated.class, "TaskRelated", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRelated_Task(), theNewPackage2Package.getCodingTask(), null, "task", null, 1, -1, TaskRelated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRelatedEClass, ProcessRelated.class, "ProcessRelated", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionaryByTaskEClass, QuestionaryByTask.class, "QuestionaryByTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionnaireByProcessEClass, QuestionnaireByProcess.class, "QuestionnaireByProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_Enunciation(), this.getQuestionContent(), null, "enunciation", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionContentEClass, QuestionContent.class, "QuestionContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Type(), this.getFieldTypes(), "type", "text", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoice_Choices(), this.getQuestionContent(), null, "choices", null, 2, -1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoice_Type(), this.getChoiceTypes(), "type", "unique", 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(codingArtifactTypesEEnum, CodingArtifactTypes.class, "CodingArtifactTypes");
		addEEnumLiteral(codingArtifactTypesEEnum, CodingArtifactTypes.SOURCE_CODE);
		addEEnumLiteral(codingArtifactTypesEEnum, CodingArtifactTypes.TEST);
		addEEnumLiteral(codingArtifactTypesEEnum, CodingArtifactTypes.DOCUMENT);
		addEEnumLiteral(codingArtifactTypesEEnum, CodingArtifactTypes.DESCRIPTION);
		addEEnumLiteral(codingArtifactTypesEEnum, CodingArtifactTypes.OTHERS);

		initEEnum(questionnarieAllocationEEnum, QuestionnarieAllocation.class, "QuestionnarieAllocation");
		addEEnumLiteral(questionnarieAllocationEEnum, QuestionnarieAllocation.BEFORE);
		addEEnumLiteral(questionnarieAllocationEEnum, QuestionnarieAllocation.AFTER);
		addEEnumLiteral(questionnarieAllocationEEnum, QuestionnarieAllocation.DURING);

		initEEnum(choiceTypesEEnum, ChoiceTypes.class, "ChoiceTypes");
		addEEnumLiteral(choiceTypesEEnum, ChoiceTypes.UNIQUE);
		addEEnumLiteral(choiceTypesEEnum, ChoiceTypes.MULTI);

		initEEnum(fieldTypesEEnum, FieldTypes.class, "FieldTypes");
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.TEXT);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.PARAGRAPH);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.NUMBER);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.DATE);
	}

} //NewPackage4PackageImpl
