/**
 */
package codingExperimentOntology.threats.util;

import codingExperimentOntology.threats.*;

import experimentOntology.planning.threats.Threat;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.threats.NewPackage3Package
 * @generated
 */
public class NewPackage3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NewPackage3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewPackage3Switch<Adapter> modelSwitch =
		new NewPackage3Switch<Adapter>() {
			@Override
			public Adapter caseIndividualBackground(IndividualBackground object) {
				return createIndividualBackgroundAdapter();
			}
			@Override
			public Adapter caseIndividualKnolegment(IndividualKnolegment object) {
				return createIndividualKnolegmentAdapter();
			}
			@Override
			public Adapter caseSubjectRelated(SubjectRelated object) {
				return createSubjectRelatedAdapter();
			}
			@Override
			public Adapter caseTechnical(Technical object) {
				return createTechnicalAdapter();
			}
			@Override
			public Adapter caseStudyObjectRelated(StudyObjectRelated object) {
				return createStudyObjectRelatedAdapter();
			}
			@Override
			public Adapter caseGender(Gender object) {
				return createGenderAdapter();
			}
			@Override
			public Adapter caseInteligence(Inteligence object) {
				return createInteligenceAdapter();
			}
			@Override
			public Adapter caseColorBlind(ColorBlind object) {
				return createColorBlindAdapter();
			}
			@Override
			public Adapter caseCulture(Culture object) {
				return createCultureAdapter();
			}
			@Override
			public Adapter caseAbility(Ability object) {
				return createAbilityAdapter();
			}
			@Override
			public Adapter caseFamiliarityWithObject(FamiliarityWithObject object) {
				return createFamiliarityWithObjectAdapter();
			}
			@Override
			public Adapter caseDomainKnolegment(DomainKnolegment object) {
				return createDomainKnolegmentAdapter();
			}
			@Override
			public Adapter caseProgrammingExperience(ProgrammingExperience object) {
				return createProgrammingExperienceAdapter();
			}
			@Override
			public Adapter caseReadingTime(ReadingTime object) {
				return createReadingTimeAdapter();
			}
			@Override
			public Adapter caseFadigue(Fadigue object) {
				return createFadigueAdapter();
			}
			@Override
			public Adapter caseMotivation(Motivation object) {
				return createMotivationAdapter();
			}
			@Override
			public Adapter caseTreatmentPreference(TreatmentPreference object) {
				return createTreatmentPreferenceAdapter();
			}
			@Override
			public Adapter caseEducation(Education object) {
				return createEducationAdapter();
			}
			@Override
			public Adapter caseFamiliarityWithTool(FamiliarityWithTool object) {
				return createFamiliarityWithToolAdapter();
			}
			@Override
			public Adapter caseAvaluationApprehension(AvaluationApprehension object) {
				return createAvaluationApprehensionAdapter();
			}
			@Override
			public Adapter caseHawthroneEffect(HawthroneEffect object) {
				return createHawthroneEffectAdapter();
			}
			@Override
			public Adapter caseProcessConformance(ProcessConformance object) {
				return createProcessConformanceAdapter();
			}
			@Override
			public Adapter caseStudyObjectCoverange(StudyObjectCoverange object) {
				return createStudyObjectCoverangeAdapter();
			}
			@Override
			public Adapter caseTiesToPersistMemory(TiesToPersistMemory object) {
				return createTiesToPersistMemoryAdapter();
			}
			@Override
			public Adapter caseTimePressure(TimePressure object) {
				return createTimePressureAdapter();
			}
			@Override
			public Adapter caseVisualEffort(VisualEffort object) {
				return createVisualEffortAdapter();
			}
			@Override
			public Adapter caseDataConsistency(DataConsistency object) {
				return createDataConsistencyAdapter();
			}
			@Override
			public Adapter caseInstrumentation(Instrumentation object) {
				return createInstrumentationAdapter();
			}
			@Override
			public Adapter caseMonoOperationBias(MonoOperationBias object) {
				return createMonoOperationBiasAdapter();
			}
			@Override
			public Adapter caseMonoMethodBias(MonoMethodBias object) {
				return createMonoMethodBiasAdapter();
			}
			@Override
			public Adapter caseTechinicalProblem(TechinicalProblem object) {
				return createTechinicalProblemAdapter();
			}
			@Override
			public Adapter caseContexRelated(ContexRelated object) {
				return createContexRelatedAdapter();
			}
			@Override
			public Adapter caseLearningEffects(LearningEffects object) {
				return createLearningEffectsAdapter();
			}
			@Override
			public Adapter caseMortality(Mortality object) {
				return createMortalityAdapter();
			}
			@Override
			public Adapter caseNewEClass36(NewEClass36 object) {
				return createNewEClass36Adapter();
			}
			@Override
			public Adapter caseOrdering(Ordering object) {
				return createOrderingAdapter();
			}
			@Override
			public Adapter caseRosenthal(Rosenthal object) {
				return createRosenthalAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseContentOfStudyObject(ContentOfStudyObject object) {
				return createContentOfStudyObjectAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseLayoutStudyObject(LayoutStudyObject object) {
				return createLayoutStudyObjectAdapter();
			}
			@Override
			public Adapter caseSizeOfStudyObjects(SizeOfStudyObjects object) {
				return createSizeOfStudyObjectsAdapter();
			}
			@Override
			public Adapter caseTasks(Tasks object) {
				return createTasksAdapter();
			}
			@Override
			public Adapter caseGenericMitigable(GenericMitigable object) {
				return createGenericMitigableAdapter();
			}
			@Override
			public Adapter caseReviewableMitigation(ReviewableMitigation object) {
				return createReviewableMitigationAdapter();
			}
			@Override
			public Adapter caseAskableMitigation(AskableMitigation object) {
				return createAskableMitigationAdapter();
			}
			@Override
			public Adapter caseGenericMitigation(GenericMitigation object) {
				return createGenericMitigationAdapter();
			}
			@Override
			public Adapter caseMitigatingByAsking(MitigatingByAsking object) {
				return createMitigatingByAskingAdapter();
			}
			@Override
			public Adapter caseMitigatingByReviewing(MitigatingByReviewing object) {
				return createMitigatingByReviewingAdapter();
			}
			@Override
			public Adapter caseThreat(Threat object) {
				return createThreatAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.IndividualBackground <em>Individual Background</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.IndividualBackground
	 * @generated
	 */
	public Adapter createIndividualBackgroundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.IndividualKnolegment <em>Individual Knolegment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.IndividualKnolegment
	 * @generated
	 */
	public Adapter createIndividualKnolegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.SubjectRelated <em>Subject Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.SubjectRelated
	 * @generated
	 */
	public Adapter createSubjectRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Technical <em>Technical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Technical
	 * @generated
	 */
	public Adapter createTechnicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.StudyObjectRelated <em>Study Object Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.StudyObjectRelated
	 * @generated
	 */
	public Adapter createStudyObjectRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Gender
	 * @generated
	 */
	public Adapter createGenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Inteligence <em>Inteligence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Inteligence
	 * @generated
	 */
	public Adapter createInteligenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ColorBlind <em>Color Blind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ColorBlind
	 * @generated
	 */
	public Adapter createColorBlindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Culture <em>Culture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Culture
	 * @generated
	 */
	public Adapter createCultureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Ability
	 * @generated
	 */
	public Adapter createAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.FamiliarityWithObject <em>Familiarity With Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.FamiliarityWithObject
	 * @generated
	 */
	public Adapter createFamiliarityWithObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.DomainKnolegment <em>Domain Knolegment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.DomainKnolegment
	 * @generated
	 */
	public Adapter createDomainKnolegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ProgrammingExperience <em>Programming Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ProgrammingExperience
	 * @generated
	 */
	public Adapter createProgrammingExperienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ReadingTime <em>Reading Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ReadingTime
	 * @generated
	 */
	public Adapter createReadingTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Fadigue <em>Fadigue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Fadigue
	 * @generated
	 */
	public Adapter createFadigueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Motivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Motivation
	 * @generated
	 */
	public Adapter createMotivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.TreatmentPreference <em>Treatment Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.TreatmentPreference
	 * @generated
	 */
	public Adapter createTreatmentPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Education
	 * @generated
	 */
	public Adapter createEducationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.FamiliarityWithTool <em>Familiarity With Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.FamiliarityWithTool
	 * @generated
	 */
	public Adapter createFamiliarityWithToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.AvaluationApprehension <em>Avaluation Apprehension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.AvaluationApprehension
	 * @generated
	 */
	public Adapter createAvaluationApprehensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.HawthroneEffect <em>Hawthrone Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.HawthroneEffect
	 * @generated
	 */
	public Adapter createHawthroneEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ProcessConformance <em>Process Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ProcessConformance
	 * @generated
	 */
	public Adapter createProcessConformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.StudyObjectCoverange <em>Study Object Coverange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.StudyObjectCoverange
	 * @generated
	 */
	public Adapter createStudyObjectCoverangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.TiesToPersistMemory <em>Ties To Persist Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.TiesToPersistMemory
	 * @generated
	 */
	public Adapter createTiesToPersistMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.TimePressure <em>Time Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.TimePressure
	 * @generated
	 */
	public Adapter createTimePressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.VisualEffort <em>Visual Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.VisualEffort
	 * @generated
	 */
	public Adapter createVisualEffortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.DataConsistency <em>Data Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.DataConsistency
	 * @generated
	 */
	public Adapter createDataConsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Instrumentation <em>Instrumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Instrumentation
	 * @generated
	 */
	public Adapter createInstrumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.MonoOperationBias <em>Mono Operation Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.MonoOperationBias
	 * @generated
	 */
	public Adapter createMonoOperationBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.MonoMethodBias <em>Mono Method Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.MonoMethodBias
	 * @generated
	 */
	public Adapter createMonoMethodBiasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.TechinicalProblem <em>Techinical Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.TechinicalProblem
	 * @generated
	 */
	public Adapter createTechinicalProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ContexRelated <em>Contex Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ContexRelated
	 * @generated
	 */
	public Adapter createContexRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.LearningEffects <em>Learning Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.LearningEffects
	 * @generated
	 */
	public Adapter createLearningEffectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Mortality <em>Mortality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Mortality
	 * @generated
	 */
	public Adapter createMortalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.NewEClass36 <em>New EClass36</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.NewEClass36
	 * @generated
	 */
	public Adapter createNewEClass36Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Ordering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Ordering
	 * @generated
	 */
	public Adapter createOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Rosenthal <em>Rosenthal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Rosenthal
	 * @generated
	 */
	public Adapter createRosenthalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ContentOfStudyObject <em>Content Of Study Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ContentOfStudyObject
	 * @generated
	 */
	public Adapter createContentOfStudyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.LayoutStudyObject <em>Layout Study Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.LayoutStudyObject
	 * @generated
	 */
	public Adapter createLayoutStudyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.SizeOfStudyObjects <em>Size Of Study Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.SizeOfStudyObjects
	 * @generated
	 */
	public Adapter createSizeOfStudyObjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.Tasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.Tasks
	 * @generated
	 */
	public Adapter createTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.GenericMitigable <em>Generic Mitigable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.GenericMitigable
	 * @generated
	 */
	public Adapter createGenericMitigableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.ReviewableMitigation <em>Reviewable Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.ReviewableMitigation
	 * @generated
	 */
	public Adapter createReviewableMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.AskableMitigation <em>Askable Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.AskableMitigation
	 * @generated
	 */
	public Adapter createAskableMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.GenericMitigation <em>Generic Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.GenericMitigation
	 * @generated
	 */
	public Adapter createGenericMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.MitigatingByAsking <em>Mitigating By Asking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.MitigatingByAsking
	 * @generated
	 */
	public Adapter createMitigatingByAskingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.threats.MitigatingByReviewing <em>Mitigating By Reviewing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.threats.MitigatingByReviewing
	 * @generated
	 */
	public Adapter createMitigatingByReviewingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.threats.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.threats.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NewPackage3AdapterFactory
