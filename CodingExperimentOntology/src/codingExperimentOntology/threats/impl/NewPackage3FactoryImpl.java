/**
 */
package codingExperimentOntology.threats.impl;

import codingExperimentOntology.threats.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewPackage3FactoryImpl extends EFactoryImpl implements NewPackage3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewPackage3Factory init() {
		try {
			NewPackage3Factory theNewPackage3Factory = (NewPackage3Factory)EPackage.Registry.INSTANCE.getEFactory(NewPackage3Package.eNS_URI);
			if (theNewPackage3Factory != null) {
				return theNewPackage3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewPackage3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NewPackage3Package.GENDER: return createGender();
			case NewPackage3Package.INTELIGENCE: return createInteligence();
			case NewPackage3Package.COLOR_BLIND: return createColorBlind();
			case NewPackage3Package.CULTURE: return createCulture();
			case NewPackage3Package.ABILITY: return createAbility();
			case NewPackage3Package.FAMILIARITY_WITH_OBJECT: return createFamiliarityWithObject();
			case NewPackage3Package.DOMAIN_KNOLEGMENT: return createDomainKnolegment();
			case NewPackage3Package.PROGRAMMING_EXPERIENCE: return createProgrammingExperience();
			case NewPackage3Package.READING_TIME: return createReadingTime();
			case NewPackage3Package.FADIGUE: return createFadigue();
			case NewPackage3Package.MOTIVATION: return createMotivation();
			case NewPackage3Package.TREATMENT_PREFERENCE: return createTreatmentPreference();
			case NewPackage3Package.EDUCATION: return createEducation();
			case NewPackage3Package.FAMILIARITY_WITH_TOOL: return createFamiliarityWithTool();
			case NewPackage3Package.AVALUATION_APPREHENSION: return createAvaluationApprehension();
			case NewPackage3Package.HAWTHRONE_EFFECT: return createHawthroneEffect();
			case NewPackage3Package.PROCESS_CONFORMANCE: return createProcessConformance();
			case NewPackage3Package.STUDY_OBJECT_COVERANGE: return createStudyObjectCoverange();
			case NewPackage3Package.TIES_TO_PERSIST_MEMORY: return createTiesToPersistMemory();
			case NewPackage3Package.TIME_PRESSURE: return createTimePressure();
			case NewPackage3Package.VISUAL_EFFORT: return createVisualEffort();
			case NewPackage3Package.DATA_CONSISTENCY: return createDataConsistency();
			case NewPackage3Package.INSTRUMENTATION: return createInstrumentation();
			case NewPackage3Package.MONO_OPERATION_BIAS: return createMonoOperationBias();
			case NewPackage3Package.MONO_METHOD_BIAS: return createMonoMethodBias();
			case NewPackage3Package.TECHINICAL_PROBLEM: return createTechinicalProblem();
			case NewPackage3Package.LEARNING_EFFECTS: return createLearningEffects();
			case NewPackage3Package.MORTALITY: return createMortality();
			case NewPackage3Package.NEW_ECLASS36: return createNewEClass36();
			case NewPackage3Package.ORDERING: return createOrdering();
			case NewPackage3Package.ROSENTHAL: return createRosenthal();
			case NewPackage3Package.SELECTION: return createSelection();
			case NewPackage3Package.CONTENT_OF_STUDY_OBJECT: return createContentOfStudyObject();
			case NewPackage3Package.LANGUAGE: return createLanguage();
			case NewPackage3Package.LAYOUT_STUDY_OBJECT: return createLayoutStudyObject();
			case NewPackage3Package.SIZE_OF_STUDY_OBJECTS: return createSizeOfStudyObjects();
			case NewPackage3Package.TASKS: return createTasks();
			case NewPackage3Package.GENERIC_MITIGATION: return createGenericMitigation();
			case NewPackage3Package.MITIGATING_BY_ASKING: return createMitigatingByAsking();
			case NewPackage3Package.MITIGATING_BY_REVIEWING: return createMitigatingByReviewing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGender() {
		GenderImpl gender = new GenderImpl();
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inteligence createInteligence() {
		InteligenceImpl inteligence = new InteligenceImpl();
		return inteligence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorBlind createColorBlind() {
		ColorBlindImpl colorBlind = new ColorBlindImpl();
		return colorBlind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Culture createCulture() {
		CultureImpl culture = new CultureImpl();
		return culture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliarityWithObject createFamiliarityWithObject() {
		FamiliarityWithObjectImpl familiarityWithObject = new FamiliarityWithObjectImpl();
		return familiarityWithObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainKnolegment createDomainKnolegment() {
		DomainKnolegmentImpl domainKnolegment = new DomainKnolegmentImpl();
		return domainKnolegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingExperience createProgrammingExperience() {
		ProgrammingExperienceImpl programmingExperience = new ProgrammingExperienceImpl();
		return programmingExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingTime createReadingTime() {
		ReadingTimeImpl readingTime = new ReadingTimeImpl();
		return readingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fadigue createFadigue() {
		FadigueImpl fadigue = new FadigueImpl();
		return fadigue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motivation createMotivation() {
		MotivationImpl motivation = new MotivationImpl();
		return motivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatmentPreference createTreatmentPreference() {
		TreatmentPreferenceImpl treatmentPreference = new TreatmentPreferenceImpl();
		return treatmentPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Education createEducation() {
		EducationImpl education = new EducationImpl();
		return education;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamiliarityWithTool createFamiliarityWithTool() {
		FamiliarityWithToolImpl familiarityWithTool = new FamiliarityWithToolImpl();
		return familiarityWithTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvaluationApprehension createAvaluationApprehension() {
		AvaluationApprehensionImpl avaluationApprehension = new AvaluationApprehensionImpl();
		return avaluationApprehension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HawthroneEffect createHawthroneEffect() {
		HawthroneEffectImpl hawthroneEffect = new HawthroneEffectImpl();
		return hawthroneEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessConformance createProcessConformance() {
		ProcessConformanceImpl processConformance = new ProcessConformanceImpl();
		return processConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyObjectCoverange createStudyObjectCoverange() {
		StudyObjectCoverangeImpl studyObjectCoverange = new StudyObjectCoverangeImpl();
		return studyObjectCoverange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiesToPersistMemory createTiesToPersistMemory() {
		TiesToPersistMemoryImpl tiesToPersistMemory = new TiesToPersistMemoryImpl();
		return tiesToPersistMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePressure createTimePressure() {
		TimePressureImpl timePressure = new TimePressureImpl();
		return timePressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualEffort createVisualEffort() {
		VisualEffortImpl visualEffort = new VisualEffortImpl();
		return visualEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConsistency createDataConsistency() {
		DataConsistencyImpl dataConsistency = new DataConsistencyImpl();
		return dataConsistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instrumentation createInstrumentation() {
		InstrumentationImpl instrumentation = new InstrumentationImpl();
		return instrumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonoOperationBias createMonoOperationBias() {
		MonoOperationBiasImpl monoOperationBias = new MonoOperationBiasImpl();
		return monoOperationBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonoMethodBias createMonoMethodBias() {
		MonoMethodBiasImpl monoMethodBias = new MonoMethodBiasImpl();
		return monoMethodBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechinicalProblem createTechinicalProblem() {
		TechinicalProblemImpl techinicalProblem = new TechinicalProblemImpl();
		return techinicalProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningEffects createLearningEffects() {
		LearningEffectsImpl learningEffects = new LearningEffectsImpl();
		return learningEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mortality createMortality() {
		MortalityImpl mortality = new MortalityImpl();
		return mortality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass36 createNewEClass36() {
		NewEClass36Impl newEClass36 = new NewEClass36Impl();
		return newEClass36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ordering createOrdering() {
		OrderingImpl ordering = new OrderingImpl();
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rosenthal createRosenthal() {
		RosenthalImpl rosenthal = new RosenthalImpl();
		return rosenthal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentOfStudyObject createContentOfStudyObject() {
		ContentOfStudyObjectImpl contentOfStudyObject = new ContentOfStudyObjectImpl();
		return contentOfStudyObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutStudyObject createLayoutStudyObject() {
		LayoutStudyObjectImpl layoutStudyObject = new LayoutStudyObjectImpl();
		return layoutStudyObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeOfStudyObjects createSizeOfStudyObjects() {
		SizeOfStudyObjectsImpl sizeOfStudyObjects = new SizeOfStudyObjectsImpl();
		return sizeOfStudyObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tasks createTasks() {
		TasksImpl tasks = new TasksImpl();
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMitigation createGenericMitigation() {
		GenericMitigationImpl genericMitigation = new GenericMitigationImpl();
		return genericMitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MitigatingByAsking createMitigatingByAsking() {
		MitigatingByAskingImpl mitigatingByAsking = new MitigatingByAskingImpl();
		return mitigatingByAsking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MitigatingByReviewing createMitigatingByReviewing() {
		MitigatingByReviewingImpl mitigatingByReviewing = new MitigatingByReviewingImpl();
		return mitigatingByReviewing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage3Package getNewPackage3Package() {
		return (NewPackage3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewPackage3Package getPackage() {
		return NewPackage3Package.eINSTANCE;
	}

} //NewPackage3FactoryImpl
